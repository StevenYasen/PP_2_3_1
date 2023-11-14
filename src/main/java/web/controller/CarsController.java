package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private CarService carService;

    @Autowired
    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }

    //    @GetMapping("/cars")
//    public String getAllCars(Model model){
//        return "redirect:cars?count=5";
//    }
    @GetMapping("/cars")
//    @ResponseBody
    public String getCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        count = (count == null || count > 5) ? 5 : count < 0 ? 0 : count;
        List<Car> listOfCars = carService.createCars(count);
        model.addAttribute("cars", listOfCars);
        return "cars";
    }
}
