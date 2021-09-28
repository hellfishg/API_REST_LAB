package aero.api_rest.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryDTO implements Serializable {

        @JsonIgnoreProperties
        private Long id;

        @JsonIgnoreProperties
        private String name;

        @JsonIgnoreProperties
        private Long parent_id;

        @JsonIgnoreProperties
        private List<CategoryDTO> subcategories = new ArrayList<>();

        //Getters and Setters:
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Long getParent_id() {
                return parent_id;
        }

        public void setParent_id(Long parent_id) {
                this.parent_id = parent_id;
        }

        public List<CategoryDTO> getSubcategories() {
                return subcategories;
        }

        public void createSubCategory (Category category) {
                this.setId(category.getId());
                this.setName(category.getName());
                this.setParent_id(category.getParent_id());
        }

        public void addNewSubCategory(Category category) {
                CategoryDTO categoryDTO = new CategoryDTO();
                categoryDTO.setId(category.getId());
                categoryDTO.setName(category.getName());
                categoryDTO.setParent_id(category.getParent_id());
                this.getSubcategories().add(categoryDTO);
        }
}
