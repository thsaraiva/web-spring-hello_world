package com.developments.tms.hellospringboot.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpServletRequest

@Controller
@RequestMapping("cheese")
class CheeseController {

    private val cheeses = mutableListOf("Cheddar", "Parmesan", "Mozzarella")

    @RequestMapping()
    fun index(model: Model): String {
        model.addAttribute("cheeses", cheeses)
        model.addAttribute("title", "My Cheese list:")
        //template name, not the full file name
        return "cheese/index"
    }

    @RequestMapping("add", method = [RequestMethod.GET])
    fun displayCheeseForm(model: Model): String {
        model.addAttribute("title", "Add cheese")
        return "cheese/add"
    }

    @RequestMapping("add", method = [RequestMethod.POST])
    fun processAddCheese(@RequestParam cheeseName: String): String {
        cheeses.add(cheeseName)
        return "redirect:"
    }
}