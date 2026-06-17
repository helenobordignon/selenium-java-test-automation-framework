# language: pt

Funcionalidade: Funcionalidade de login

  Cenário: Login com sucesso

    Dado que o usuário está na página de login
    Quando o usuário informa o nome de usuário "standard_user"
    E o usuário informa a senha "secret_sauce"
    E o usuário clica no botão de login
    Então o usuário deve ser redirecionado para a página de inventário