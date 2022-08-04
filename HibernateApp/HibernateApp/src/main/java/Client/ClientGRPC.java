package Client;

import DTO.DTOForUser;
import Services.UsersService;
import com.example.grpc.UserServiceGrpc;
import com.example.grpc.UserServiceOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientGRPC {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080").usePlaintext().build();

        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);

        UserServiceOuterClass.UserRequest request = UserServiceOuterClass.UserRequest.newBuilder().setLogin("Log").build();

        DTOForUser newUser = new DTOForUser();
        newUser.setLogin(request.getLogin());
        new UsersService().addUser(newUser);

        UserServiceOuterClass.UserResponse response = stub.add(request);


        System.out.println(response);

        channel.shutdownNow();
    }

}
