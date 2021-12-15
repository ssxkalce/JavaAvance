package fr.dauphine.javaavancee.td7;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.Iterator;



public class DirMonitor {
	private final Path dir;
	public DirMonitor(Path dir) {
		if (Files.isReadable(dir) && Files.isDirectory(dir)){
			this.dir=dir;
		}
		else throw new IllegalArgumentException("Invalid path");
			
		}
	
	public static void Display(Path p) throws IOException {
		for(Path p: Files.newDirectoryStream(dir)) {
			System.out.println(p.getFileName());
		}
	}
	
	/*expression lambda 
	  public void printFiles() throws IOException{
	  DirectoryStream<Path> dirStream = newDirectoryStream(dir);
	  dirStream.foreach(p->System.out.println(p.getFileName());
	  }
	*
	*/
	
	public static long sizeOfFiles(Path p) throws IOException {
		
		long sum=0;
		for(Path p : Files.newDirectoryStream(dir)) {
			if(!Files.isDirectory(p)){
				sum += Files.size(p);
			}
		}
		return sum;
	}
	public Path mostRecent() throws IOException{
		Path rec = null;
		FileTime last = FileTime.fromMillis(0);
		for(Path p: Files.newDirectoryStream(dir)) {
			FileTime pT =Files.getLastModifiedTime(p);
			if(pT.compareTo(last)>0) {
				last = pT;
				rec = p;
			}
		}
		return rec;
	}
	
	class sizeFilter implements DirectoryStream.Filter<Path>{
		public sizeFilter(int sizeBound) {
			this.sizeBound = sizeBound;
		}
		
		@Override
		public boolean accept(Path entry) throws IOException{
			return Files.size(entry) >= sizeBounds;
		}
	}
	
	public void print FileFilter(int sizeBound) throws IOException{
		DirectoryStream.Filter<path> filter = new sizeFIlter(sizeBound);
		for(Path p : Files.newDirectoryStream(dir,filter)) {
			System.out.println(p);
		}
	}
	
	public void printFileFIlter(int sizeBound) throws IOException{
		for (Path p : Files.newDirectoryStream(dir, newDirectoryStream.Filter<path>)()) {
			@Override
			public boolean accept(int sizeBound) {
				
			}
		}
	}
	
	public void pF(int sizeBound) throws IOException{
		
		Files.newDirectoryStream(dir, c->Files.size(c)>sizeBound);
		foeach(p->system.out.println(p));
	}
	
	
}


		
	

