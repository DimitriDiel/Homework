package lesson29.shoppinglist.dto;

import lesson29.shoppinglist.dto.error.ErrorDto;

import java.util.List;

public class ResponseForClientRemoveProduct {

    private String successRemove;

    private List<ErrorDto> errorDtoList;

    public ResponseForClientRemoveProduct(String successRemove, List<ErrorDto> errorDtoList) {
        this.successRemove = successRemove;
        this.errorDtoList = errorDtoList;
    }

    public String getSuccessRemove() {
        return successRemove;
    }

    public List<ErrorDto> getErrorDtoList() {
        return errorDtoList;
    }

    @Override
    public String toString() {
        return "ResponseForClientDeleteProductByName{" +
                "successRemove='" + successRemove + '\'' +
                ", errorDtoList=" + errorDtoList +
                '}';
    }
}
