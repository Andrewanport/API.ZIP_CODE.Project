package servico;

import com.example.api.dto.EnderecoDto;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        ApiServico apiServico = new ApiServico();

        try {

            EnderecoDto enderecoDto = apiServico.getEndereco("79680970");
            System.out.println(enderecoDto);
        } catch (IOException | InterruptedException e) {

            throw new RuntimeException(e);

        }
    }
}
