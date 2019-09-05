package com.lab.assignment.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

@SpringBootApplication
@RestController
public class CarApplication {
    ArrayList<Car> cars = new ArrayList<Car>();

    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Car> create(@RequestBody Car car){
        this.cars.add(car);
        return new ResponseEntity<Car>(car, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<List<Car>> delete(@PathVariable("id") int id) {
        this.cars.remove(id);
        return new ResponseEntity<List<Car>>(this.cars, HttpStatus.OK);
    }


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseEntity<Car> get(@PathVariable("id") int id) {
        return new ResponseEntity<Car>(this.cars.get(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ResponseEntity<Car> update(@PathVariable("id") int id, @RequestBody Car car) {
        this.cars.get(id).setColor(car.color);
        this.cars.get(id).setType(car.type);
        this.cars.get(id).setDisplacement(car.displacement);
        this.cars.get(id).hasSunroof(car.sunroof);
        this.cars.get(id).setSpeed(car.speed);
        return new ResponseEntity<Car>(car, HttpStatus.OK);
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Car>> get() {
        return new ResponseEntity<List<Car>>(this.cars, HttpStatus.OK);
    }

}

