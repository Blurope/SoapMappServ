package binary.server;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface FileTransferer {
    @WebMethod
    public void upload(String fileName, byte[] imageBytes);

    @WebMethod
    public byte[] download(String fileName);
}