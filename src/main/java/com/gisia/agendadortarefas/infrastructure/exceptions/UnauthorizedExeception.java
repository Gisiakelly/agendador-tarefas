package com.gisia.agendadortarefas.infrastructure.exceptions;

import org.springframework.security.core.AuthenticationException;

public class UnauthorizedExeception extends AuthenticationException{

    public UnauthorizedExeception(String mensagem) { super(mensagem);}

    public UnauthorizedExeception(String mensagem, Throwable throwable){super(mensagem, throwable);}
}
