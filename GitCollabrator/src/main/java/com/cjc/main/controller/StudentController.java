package com.cjc.main.controller;
@RestController
public class StudentController {
  @PostMapping("/SaveData")
  public String postdetails(@RequestBody Student student)
  {
        return studentdata;
}
