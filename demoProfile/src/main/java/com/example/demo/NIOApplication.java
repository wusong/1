package com.example.demo;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.StandardOpenOption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class NIOApplication implements CommandLineRunner {
	Logger logger = LoggerFactory.getLogger(NIOApplication.class);
	@Override
	public void run(String... args) throws Exception {
		FileChannel channel = FileChannel.open(FileSystems.getDefault().getPath("pom.xml"), StandardOpenOption.READ);
		long position = channel.position();
		long size = channel.size();
		ByteBuffer dst = ByteBuffer.allocate((int) size);
		channel.read(dst );
		logger.info(new String(dst.array()));
		logger.info(position+"");
		logger.info(size+"");
	}

}
