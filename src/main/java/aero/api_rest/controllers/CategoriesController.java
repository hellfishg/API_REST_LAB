package aero.api_rest.controllers;

import aero.api_rest.models.Category;
import aero.api_rest.models.CategoryDTO;
import aero.api_rest.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoriesController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping()
    public ResponseEntity<List<Category>> list() {
        List<Category> categories = categoryRepository.findAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/category_tree")
    public ResponseEntity<List<CategoryDTO>> category_tree() {
        List<CategoryDTO> categoryDTOList = new ArrayList<>();
        categoryRepository.findAll().forEach(e -> {
                    CategoryDTO categoryDTO = new CategoryDTO();
                    if (e.getParent_id() == null) {
                        categoryDTO.createSubCategory(e);
                        categoryDTOList.add(categoryDTO);
                    } else {
                        searchAndCreateSubcategories(e, categoryDTOList);
                    }
        });

        return new ResponseEntity<>(categoryDTOList, HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public Category create(@RequestBody Category category) {
        //TODO: Validar que no cree categorias huerfanas.
        return categoryRepository.save(category);
    }

    public Boolean searchAndCreateSubcategories(Category category, List<CategoryDTO> categoryDTOList) {
        for (CategoryDTO categoryDTO : categoryDTOList) {
            if (category.getParent_id().equals(categoryDTO.getId())) {
                categoryDTO.addNewSubCategory(category);
                return true;
            }

            if (searchAndCreateSubcategories(category, categoryDTO.getSubcategories())){
                return true;
            }
        }
        return false;
    }
}
