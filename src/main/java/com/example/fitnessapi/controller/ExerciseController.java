package com.example.fitnessapi.controller;

import com.example.fitnessapi.model.Exercise;
import com.example.fitnessapi.service.ExerciseService;
import com.example.fitnessapi.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // this is a rest controller for our rest api
@RequestMapping(path = "/api/") // this is the designated url path: http://localhost:9092/api/
public class ExerciseController {

    public ExerciseService exerciseService;
    public WorkoutService workoutService;

    @Autowired
    public void setExerciseService(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @Autowired
    public void setWorkoutService(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    /**
     * createWorkoutExercise uses the createWorkoutExercise from the exerciseService
     * to create a new exercise for a certain workout.
     * @param workoutId is the workout we want to make a new exercise in
     * @param exerciseObject is the exercise we want to make
     * @return calls upon the createWorkoutExercise in the exerciseService
     */
    // (POST) As a user, I can create a new exercise for a certain workout
    // http://localhost:9092/api/workouts/{workoutId}/exercises/
    @PostMapping(path = "/workouts/{workoutId}/exercises/")
    public Exercise createWorkoutExercise(@PathVariable Long workoutId, @RequestBody Exercise exerciseObject){
        return exerciseService.createWorkoutExercise(workoutId, exerciseObject);
    }

    /**
     * getWorkoutExercises uses the getWorkoutExercises from the exerciseService
     * to get a list of all exercises for a certain workout.
     * @param workoutId is the workout we want to get all the exercises of
     * @return cals upon the getWorkoutExercises in the exerciseService
     */
    // (GET) As a user, I can get a list of all my exercises for a certain workout
    // http://localhost:9092/api/workouts/{workoutId}/exercises/
    @GetMapping(path = "/workouts/{workoutId}/exercises/")
    public List<Exercise> getWorkoutExercises(@PathVariable Long workoutId){
        return exerciseService.getWorkoutExercises(workoutId);
    }

    // (PUT) As a user, I can update a certain exercise for a certain workout
    // http://localhost:9092/api/workouts/{workoutId}/exercises/{exerciseId}

    // (DELETE) As a user, I can delete a certain exercise for a certain workout
    // http://localhost:9092/api/workouts/{workoutId}/exercises/{exerciseId}
}
