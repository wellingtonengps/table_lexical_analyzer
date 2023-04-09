import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner lex = new Scanner(args[0]);
        Token token = lex.nextToken();
        while(token.getToken() != Token.EOF){
             System.out.println("Token " + token.getToken() +" Lexeme: " + token.getLexeme());
             token = lex.nextToken();
        }
    }
}