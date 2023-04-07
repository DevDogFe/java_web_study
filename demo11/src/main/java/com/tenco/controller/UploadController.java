package com.tenco.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet("/uploadProc")
public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UploadController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 파일 업로드 처리
		Part filePart = request.getPart("file");
		System.out.println("파일 타입:" + filePart.getContentType());
		System.out.println("파일 사이즈(byte 기반):" + filePart.getSize());
		System.out.println("파일 이름:" + filePart.getSubmittedFileName());
		
		// 스트림 준비
		InputStream fileContent = filePart.getInputStream();
		
		// 출력 스트림 --> 내 서버 컴퓨터에 File 객체 만들어서 저장
		OutputStream outputStream = null;
		
		try {
			// 랜덤한 문자열 생성
			UUID uuid = UUID.randomUUID();
			System.out.println("uuid: "+uuid);
			String fileName = uuid + "_" + filePart.getSubmittedFileName();
			//1단계: 파일을 저장할 폴더를 미리 만들기 C:\jsp_upload
			File file = new File("C:/jsp_upload/", fileName);
			//파일 출력 스트림 생성
			outputStream = new FileOutputStream(file);
			//입력스트림에서 바이트단위로 읽어오면서 출력스트림에 쓰기
			byte[] buffer = new byte[1024];
			int length;
			while((length = fileContent.read(buffer)) != -1) {
				outputStream.write(buffer, 0, length);
			}
			System.out.println("File upload success");
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fileContent.close();
			if(outputStream != null) {
				outputStream.flush();
				outputStream.close();
			}
			response.sendRedirect("/demo11");
		}
		
	}

}
