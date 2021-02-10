package org.example.DAO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TextWriterImpl
    implements TextWriter
{
    private BufferedWriter writer = null;

    public TextWriterImpl(String fileName) throws IOException
    {
        writer = new BufferedWriter(new FileWriter(fileName));
    }

    @Override
    public void close() throws IOException
    {
        writer.close();
    }
    
    @Override
    public void writeLines(List<String> lines) 
            throws IOException
    {

    	
        for (String current : lines)
        {
            writer.write(current + "\n");
        }
    }
}
