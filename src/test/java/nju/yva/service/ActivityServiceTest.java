package nju.yva.service;

import nju.yva.dao.ActivityDao;
import nju.yva.model.ActivityData;
import nju.yva.service.impl.ActivityServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by Water on 2017/8/19.
 */
@RunWith(MockitoJUnitRunner.class)
@WebAppConfiguration
@SpringBootTest
public class ActivityServiceTest {
    @Mock
    private ActivityDao activityDao;

    @InjectMocks
    private ActivityService activityService = new ActivityServiceImpl(activityDao);

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testGetVoluntaryActivity() {
        when(activityDao.findOneById(1)).
                thenReturn(null);
        assertNull(activityService.getVoluntaryActivity(1));

        ActivityData data = new ActivityData();
        data.setName("NJU_ONE_DAY");
        when(activityDao.findOneById(1)).
                thenReturn(data);
        assertEquals(data.getName(), activityService.getVoluntaryActivity(1).getName());
    }

    @Test
    public void testGetAllActivities() {
        when(activityDao.findAll()).
                thenReturn(null);
        assertNull(activityService.getAllActivities());
        List<ActivityData> all = new ArrayList<>();
        ActivityData data1 = new ActivityData();
        ActivityData data2 = new ActivityData();
        all.add(data1);
        all.add(data2);
        when(activityDao.findAll()).
                thenReturn(all);
        assertEquals(all, activityService.getAllActivities());
    }

    @Test
    public void testModifyActivity() {
        ActivityData data = new ActivityData();
        data.setId(1);
        assertFalse(activityService.modifyActivity(data));
        // TODO:测试没有写完
    }
}
