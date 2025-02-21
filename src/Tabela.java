import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Mantém a anotação em tempo de execução
@Target(ElementType.TYPE) // Aplica a anotação a classes (tipos)
public @interface Tabela {
    String nome(); // Método que define o valor da anotação (nome da tabela)
}