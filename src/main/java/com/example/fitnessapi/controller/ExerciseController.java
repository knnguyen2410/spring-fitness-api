package com.example.fitnessapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // this is a rest controller for our rest api
@RequestMapping(path = "/api/") // this is the designated url path: http://localhost:9092/api/
public class ExerciseController {

// http://localhost:9092/api/workouts/{workoutId}/exercises/
// (POST) As a user, I can create a new exercise for a certain workout
// http://localhost:9092/api/workouts/{workoutId}/exercises/
// (GET) As a user, I can get a list of all my exercises for a certain workout
// http://localhost:9092/api/workouts/{workoutId}/exercises/
// (PUT) As a user, I can update the exercises for a certain workout
// http://localhost:9092/api/workouts/{workoutId}/exercises/
// (DELETE) As a user, I can delete the exercises for a certain workout

// http://localhost:9092/api/workouts/{workoutId}/exercises/{exerciseId}
// (GET) As a user, I can get a certain exercise for a certain workout
// http://localhost:9092/api/workouts/{workoutId}/exercises/{exerciseId}
// (PUT) As a user, I can update a certain exercise for a certain workout
// http://localhost:9092/api/workouts/{workoutId}/exercises/{exerciseId}
// (DELETE) As a user, I can delete a certain exercise for a certain workout

}