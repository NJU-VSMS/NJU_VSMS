package nju.yva.service;

import nju.yva.model.OrganizationData;

import java.util.List;

/**
 * Created by Water on 2017/8/19.
 */
public interface OrganizationService {
    boolean addOrganization(OrganizationData organization);

    OrganizationData getOrganization(long organizationId);

    List<OrganizationData> getAllOrganizations();

    boolean modifyOrganization(OrganizationData modifiedOrganization);

    boolean deleteOrganization(long id);
}
