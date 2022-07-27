package com.deep.sfgpetclinic.services;

import com.deep.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);


}
