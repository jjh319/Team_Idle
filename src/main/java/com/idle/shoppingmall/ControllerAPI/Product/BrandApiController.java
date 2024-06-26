package com.idle.shoppingmall.ControllerAPI.Product;

import com.idle.shoppingmall.Entity.Brand;
import com.idle.shoppingmall.RequestDTO.Product.Search.BrandSearchRequest;
import com.idle.shoppingmall.ResponseDTO.Product.BrandListResponse;
import com.idle.shoppingmall.Service.Product.BrandService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BrandApiController {
    private final BrandService brandService;

    @PostMapping("/api/GET/brand")
    public ResponseEntity<List<BrandListResponse>> getBrandByName(@RequestBody @Valid BrandSearchRequest request) {
        System.out.println(request.getName());
        List<BrandListResponse> brands = brandService.findByName(request.getName());
        System.out.println(brands.size());
        System.out.println(brands.get(0).getBrand_name());
        return ResponseEntity.ok().body(brands);
    }
}
