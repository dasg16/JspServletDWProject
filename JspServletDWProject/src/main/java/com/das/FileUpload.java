package com.das;

import java.io.IOException;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FileUpload extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		ServletFileUpload servletFileUpload = new ServletFileUpload(new DiskFileItemFactory());
//		List<FileItem> fileItem = servletFileUpload.parseRequest(req);
//
//		for (FileItem item : fileItem) {
//			item.write(new File("C:\\Users\\goura\\Music\\" + item.getName()));
//
//		}

	}

}
