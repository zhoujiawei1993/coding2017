package com.coderising.download;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.concurrent.CyclicBarrier;

import com.coderising.download.api.Connection;

public class DownloadThread extends Thread{

	Connection conn;
	int startPos;
	int endPos;
	CyclicBarrier barrier ;
	File file;
<<<<<<< HEAD
	int current;
=======
>>>>>>> 3b68226a35b37a691f64bcd4a1e219efba00a479

	public DownloadThread(CyclicBarrier barrier , Connection conn, int startPos, int endPos , File file){
		
		this.barrier = barrier;
		this.conn = conn;		
		this.startPos = startPos;
		this.endPos = endPos;
		this.file = file;
<<<<<<< HEAD
		this.current = startPos;
=======
>>>>>>> 3b68226a35b37a691f64bcd4a1e219efba00a479
	}
	public void run(){	
		try{
			System.out.println("begin download: startPos="+startPos+",endPos="+endPos);
			byte[] buffer = conn.read(startPos , endPos);
<<<<<<< HEAD
			RandomAccessFile rafile = new RandomAccessFile(file, "rw");
			rafile.seek(startPos);
			rafile.write(buffer, 0, buffer.length);
			rafile.close();
=======
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			raf.seek(startPos);
			raf.write(buffer, 0, buffer.length);
			raf.close();
>>>>>>> 3b68226a35b37a691f64bcd4a1e219efba00a479
			barrier.await();
			System.out.println("finish download: startPos="+startPos+",endPos="+endPos);
		}catch(Exception e){
			System.out.println("download error:startPos="+startPos+",endPos="+endPos+",msg:"+e.getMessage());
		}
		
	}
}
