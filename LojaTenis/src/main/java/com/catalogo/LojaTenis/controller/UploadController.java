package com.catalogo.LojaTenis.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.catalogo.LojaTenis.service.S3Service;

@RestController
@RequestMapping("/upload")
public class UploadController {
	@Autowired
	private S3Service s3Service;

	@PostMapping("/s3")
	ResponseEntity<Void> uploadFile(@RequestParam(name = "file") MultipartFile file) {
		URI uri = s3Service.upload(file);
		return ResponseEntity.created(uri).build();
	}
}
