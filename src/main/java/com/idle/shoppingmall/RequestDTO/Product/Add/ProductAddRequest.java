package com.idle.shoppingmall.RequestDTO.Product.Add;


import com.idle.shoppingmall.mapper.Manage.DTO.SizeAndCount;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductAddRequest {
    @NotNull
    private String pd_name;
    @NotNull
    private Long brand;
    @Min(10000)
    private int pd_price;
    private String pd_category;
    private List<SizeAndCount> sizes;
}

