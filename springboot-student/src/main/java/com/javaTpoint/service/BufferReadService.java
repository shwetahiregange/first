package com.javaTpoint.service;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javaTpoint.dao.Loader;
import com.javaTpoint.model.StudentStatus;
import com.javaTpoint.service.StudentStatusService;

@Service
public class BufferReadService implements Loader
{
	@Autowired
	private StudentStatusService studentStatusService;
	
	
//	public String idGenerate()
//	{  
//		for(int i=40;i<=60;i++)
//		{
//			StudentStatus studentStatus=new StudentStatus();
//			studentStatus.setId((int)i);
//			studentStatus.setStatus(false);
//			studentStatusService.addUser(studentStatus);
//		}
//		return "successpage";  
//		
//	}
//	
	
	
	@Override
	public void load() {

        try {
                // Always wrap FileReader in BufferedReader.
            BufferedReader br = new BufferedReader( new FileReader("D://text.txt"));
            StudentStatus studentStatus=new StudentStatus();
            String i;
		
			while((i=br.readLine())!= null)
            {  
				studentStatus.setId(Integer.parseInt(i));
				studentStatus.setStatus(false);
				studentStatusService.addUser(studentStatus);
            } // Always close files.
		
			 br.close();
            
        }        
        catch(IOException ex) {
           ex.printStackTrace();
        }
		
	}
}
