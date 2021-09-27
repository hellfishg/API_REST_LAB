package aero.api_rest.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryDTO implements Serializable {

        @JsonIgnoreProperties
        private Long id;

        @JsonIgnoreProperties
        private String name;

        @JsonIgnoreProperties
        private Long parent_id;

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
}
