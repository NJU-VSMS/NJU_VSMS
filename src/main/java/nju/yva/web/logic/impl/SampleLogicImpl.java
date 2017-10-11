package nju.yva.web.logic.impl;

import nju.yva.model.SampleData;
import nju.yva.service.SampleService;
import nju.yva.web.data.OperationStatus;
import nju.yva.web.data.SampleVO;
import nju.yva.web.data.wrapper.SampleWrapper;
import nju.yva.web.exception.NotFoundException;
import nju.yva.web.logic.BaseLogic;
import nju.yva.web.logic.SampleLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static nju.yva.web.data.OperationStatus.Status.FAILURE;
import static nju.yva.web.data.OperationStatus.Status.SUCCESS;

/**
 * @author Alan on 2017/3/14
 */
@Service
public class SampleLogicImpl extends BaseLogic implements SampleLogic {

    private SampleService sampleService;
    private SampleWrapper sampleWrapper;

    @Autowired
    public SampleLogicImpl(SampleService sampleService, SampleWrapper sampleWrapper) {
        this.sampleService = sampleService;
        this.sampleWrapper = sampleWrapper;
    }

    @Override
    public SampleVO getSampleData(long id) {
        SampleData sampleData = sampleService.getSample(id);
        SampleVO sampleVO = sampleWrapper.wrap(sampleData);
        if (sampleVO != null) {
            return sampleVO;
        } else {
            throw new NotFoundException("sample not found");
        }
    }

    @Override
    public OperationStatus save(String name, String detail) {
        if (sampleService.save(name, detail)) {
            return new OperationStatus(SUCCESS);
        } else {
            return new OperationStatus(FAILURE);
        }
    }

    @Override
    public OperationStatus put(long id, String name, String detail) {
        if (getSampleData(id) == null) {
            throw new NotFoundException("sample not exist");
        }
        if (sampleService.put(id, name, detail)) {
            return new OperationStatus(SUCCESS);
        } else {
            return new OperationStatus(FAILURE);
        }
    }

    @Override
    public OperationStatus delete(long id) {
        if (getSampleData(id) == null) {
            throw new NotFoundException("sample not exist");
        }
        if (sampleService.delete(id)) {
            return new OperationStatus(SUCCESS);
        } else {
            return new OperationStatus(FAILURE);
        }
    }

    @Override
    public List<SampleVO> getSamples() {
        return null;
    }
}
