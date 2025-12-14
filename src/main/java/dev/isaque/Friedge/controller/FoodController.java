package dev.isaque.Friedge.controller;

import dev.isaque.Friedge.model.Food;
import dev.isaque.Friedge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll() { return foodService.getAll();}

    @PostMapping
    public Food creater(@RequestBody Food food){return foodService.save(food);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){foodService.deletar(id);}


}