package records;

import java.util.Objects;

public record PersonRecord(String firstName, String lastName, int age) {



    public PersonRecord{
        Objects.requireNonNull(firstName);
        Objects.requireNonNull(lastName);

    }
    public PersonRecord(String firstName, String lastName){
        //Como não pode criar construtor sem chamar o construtor principal
        //usamos this e passamos os parametros a serem inicializados, delegando a chamado para o construtor principal
        this(firstName,lastName, 0);
    }


}
