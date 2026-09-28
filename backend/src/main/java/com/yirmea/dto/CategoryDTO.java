package com.yirmea.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDTO {
    private Long id;
    private String label;
    List<ItemDTO> itemDTOS;
}
