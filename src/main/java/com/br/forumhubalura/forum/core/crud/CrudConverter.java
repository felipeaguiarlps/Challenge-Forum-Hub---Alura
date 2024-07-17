package com.br.forumhubalura.forum.core.crud;

public interface CrudConverter<E, DTOC, DTOR> {

    E dtoCadToEntity(DTOC dtocad);

    DTOR entityToDTOResponse(E entity);

}