package com.akosha.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class SpringServiceController {
 @RequestMapping(value = "/get", method = RequestMethod.GET)
 public @ResponseBody String getGreeting() {
  
  return "Example of GET Request";
 }

  @RequestMapping(value = "/post", method = RequestMethod.POST)
  public @ResponseBody String postGreeting() {
   
   return "Example of POST Request";
  }
}