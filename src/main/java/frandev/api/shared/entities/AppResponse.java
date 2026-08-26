package frandev.api.shared.entities;


import lombok.AllArgsConstructor;

@AllArgsConstructor

public class AppResponse<T>{
    private final  T data;
    private final boolean sucess;
    private final String message;
    private final int statusCode;

    public static AppResponse error(String message, int statusCode) {
        return new AppResponse(
                null,
                false,
                message,
                statusCode
        );
    }

    public static <T> AppResponse<T> sucess (String message, T data) {
        return new AppResponse<T>(
                data,
                true,
                message,
                200
        );
    }

    public static  AppResponse message(String message) {
        return new AppResponse(
                null,
                true,
                message,
                200
        );
    }

}