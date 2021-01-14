package com.skorobahatko.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skorobahatko.university.domain.Participant;
import com.skorobahatko.university.domain.Timetable;
import com.skorobahatko.university.service.ParticipantService;

@Controller
@RequestMapping("/timetables")
public class TimetableController {
	
	@Autowired
	private ParticipantService participantService;
	
	@GetMapping()
	public String index(Model model) {
		List<Participant> participants = participantService.getAll();
		model.addAttribute("participants", participants);
		
		return "timetables/index";
	}
	
	@GetMapping("/participant")
	public String getTimetableForParticipant(
			@RequestParam int participantId,
			Model model) {
		
		Participant participant = participantService.getById(participantId);
		Timetable timetable = Timetable.getMonthTimetable(participant);
		
		model.addAttribute("timetable", timetable);
		
		return "timetables/timetable";
	}

}
