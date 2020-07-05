public class ServicoConfigUsuario
{
  public void mudarEmail(Usuario usuario)
  {
    if(checarAcesso(usuario))
    {
       //Dar opção para mudar
    }
  }
  public boolean checarAcesso(Usuario usuario)
  {
    //Verifica se o usuário é válido
  }
}


//pós-mudança

public class ServicoConfigUsuario 
{
  public void mudarEmail(Usuario usuario)
  {
    if(SecurityService.checarAcesso(usuario))
    {
       //Dar opção para mudar
    }
  }
}

public class ServicoSeguranca
{
  public static boolean checarAcesso(User user)
  {
        //Verifica se o usuário é válido
  }
}