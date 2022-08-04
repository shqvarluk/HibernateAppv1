package Server;


import com.example.grpc.UserServiceGrpc.UserServiceImplBase;
import com.example.grpc.UserServiceOuterClass.*;
import io.grpc.stub.StreamObserver;

public class UserServiceImpl extends UserServiceImplBase {

    @Override
    public void add(UserRequest request, StreamObserver<UserResponse> responseObserver){
        System.out.println(request);

        UserResponse response = UserResponse.newBuilder().setResult("Server add user " + request.getLogin()).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
