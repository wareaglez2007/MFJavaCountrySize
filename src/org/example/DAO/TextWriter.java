package org.example.DAO;

import java.io.IOException;
import java.util.List;

public interface TextWriter
{
    public void writeLines(List<String> lines) 
            throws IOException;
    
    public void close() throws IOException;
}
