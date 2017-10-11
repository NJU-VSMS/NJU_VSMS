package nju.yva.web.logic;

import nju.yva.web.data.OperationStatus;
import nju.yva.web.data.SampleVO;

import java.util.List;

/**
 * @author Alan on 2017/3/14
 */
public interface SampleLogic {
	SampleVO getSampleData(long id);

	OperationStatus save(String name, String detail);

	OperationStatus put(long id, String name, String detail);

	OperationStatus delete(long id);

	List<SampleVO> getSamples();
}
