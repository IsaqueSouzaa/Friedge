package dev.isaque.Friedge.service;

import dev.isaque.Friedge.model.Food;
import dev.isaque.Friedge.repository.FoodRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getAll(){return foodRepository.findAll();}

    public Food save(Food food){foodRepository.save(food);
        return food;
    }

    public void deletar(Long id){foodRepository.deleteById(id);}
}
