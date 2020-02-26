/**
 * @Author: Grishma
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.daos;

import java.util.List;

import com.lti.ol.core.entities.WorkingUser;
import com.lti.ol.core.exceptions.PrException;

public interface LoginDao {

 public List<WorkingUser> login(WorkingUser login    ) throws PrException;
 public boolean signup(WorkingUser signup) throws PrException;
}
