package com.developments.tms.hellospringboot.controllers
//
//import org.springframework.stereotype.Controller
//import org.springframework.web.bind.annotation.PathVariable
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RequestMethod
//import org.springframework.web.bind.annotation.ResponseBody
//import javax.servlet.http.HttpServletRequest
//
//@Controller
//@RequestMapping("hello")
//class HelloController {
//
//
//    @RequestMapping("name", method = [RequestMethod.GET])
//    @ResponseBody
//    fun helloNameForm(): String {
//        return "<form method='post'>" +
//                "<input type='text' name='name' />" +
//                "<input type='submit' value='Greet Me!' />" +
//                "</form>"
//    }
//
//    @RequestMapping("/{name}")
//    @ResponseBody
//    fun helloName(@PathVariable name: String): String {
//        return "Hello $name."
//    }
//
//    @RequestMapping("goodbye")
//    fun goodbye(): String {
//        return "redirect:/hello/name"
//    }
//
//    @RequestMapping("name", method = [RequestMethod.POST])
//    @ResponseBody
//    fun hello(request: HttpServletRequest): String {
//        return "Hello ${request.getParameter("name").takeIf { !it.isNullOrBlank() } ?: "World"}."
//    }
//
//}