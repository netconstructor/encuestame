/*
 ************************************************************************************
 * Copyright (C) 2001-2009 encuestame: system online surveys Copyright (C) 2009
 * encuestame Development Team.
 * Licensed under the Apache Software License version 2.0
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to  in writing,  software  distributed
 * under the License is distributed  on  an  "AS IS"  BASIS,  WITHOUT  WARRANTIES  OR
 * CONDITIONS OF ANY KIND, either  express  or  implied.  See  the  License  for  the
 * specific language governing permissions and limitations under the License.
 ************************************************************************************
 */
package org.encuestame.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.encuestame.utils.security.SignUpBean;
import org.encuestame.utils.web.ResumeResultTweetPoll;
import org.encuestame.utils.web.TypeTreeNode;
import org.encuestame.utils.web.UnitAnswersBean;
import org.encuestame.utils.web.UnitGroupBean;
import org.encuestame.utils.web.UnitPatternBean;
import org.encuestame.utils.web.UnitPermission;
import org.encuestame.utils.web.UnitPoll;
import org.encuestame.utils.web.UnitPollResult;
import org.encuestame.utils.web.UnitProjectBean;
import org.encuestame.utils.web.UnitQuestionBean;
import org.encuestame.utils.web.UnitTweetPoll;
import org.encuestame.utils.web.UnitTweetPollResult;
import org.encuestame.utils.web.UnitUserBean;
import org.encuestame.utils.web.UtilTreeNode;
import org.junit.Test;

    /**
    * Test Unit Beans.
    *
    * @author Morales, Diana Paola paola@encuestame.org
    * @since 13/03/2010 16:18:10
    * @version $Id: $
    **/
    public class TestUnitBeans extends AbstractBaseUtils {

    /**
    * Test Unit Answers Bean.
    **/
    @Test
    public void testUnitAnswerBean() {
        final UnitAnswersBean unitAnswer = createUnitAnswerBean(1L, "yes",
                "HASH", 2L);
        assertNotNull(unitAnswer.getAnswerHash());
        assertNotNull(unitAnswer.getAnswers());
        assertNotNull(unitAnswer.getAnswerId());
        assertNotNull(unitAnswer.getQuestionId());
    }

    @Test
    public void testUtilTreeNode(){
        final UtilTreeNode treeNode = new UtilTreeNode();
        treeNode.setId(1L);
        treeNode.setName("test node");
        treeNode.setNode(TypeTreeNode.FOLDER);
        assertNotNull(treeNode.getId());
        assertNotNull(treeNode.getName());
        assertNotNull(treeNode.getNode().name());
        treeNode.setNode(TypeTreeNode.ITEM);
    }

    /**
    * Test Unit Pattern Bean.
    */
    @Test
    public void testUnitPatternBean() {
        final UnitPatternBean unitPattern = createUnitPatternBean("b", "", "",
                2L, "", "", "", 1, "");
        assertNotNull(unitPattern);
    }

    /**
     * Test for {@link UnitUserBean}.
     */
    @Test
    public void testUnitUserBean(){
        final UnitUserBean userBean = new UnitUserBean();
        userBean.setId(1L);
        userBean.setDateNew(new Date());
        userBean.setEmail("juanATencuestame.org");
        userBean.setInviteCode("code");
        userBean.setName("name");
        userBean.setPassword("password");
        userBean.setPrimaryUserId(1L);
        userBean.setStatus(Boolean.TRUE);
        userBean.setUsername("username");
        final Collection<UnitPermission> listPermission = new HashSet<UnitPermission>();
        userBean.setListPermission(listPermission);
        final Collection<UnitGroupBean> listGroups = new HashSet<UnitGroupBean>();
        userBean.setListGroups(listGroups);
        assertNotNull(userBean.getId());
        assertNotNull(userBean.getDateNew());
        assertNotNull(userBean.getEmail());
        assertNotNull(userBean.getInviteCode());
        assertNotNull(userBean.getName());
        assertNotNull(userBean.getPassword());
        assertNotNull(userBean.getPrimaryUserId());
        assertNotNull(userBean.getStatus());
        assertNotNull(userBean.getUsername());
        assertEquals(userBean.getListGroups().size(), 0);
        assertEquals(userBean.getListPermission().size(), 0);
    }

    /**
     * Test {@link UnitTweetPoll}.
     */
    @Test
    public void testUnitTweetPollResults(){
        final UnitTweetPollResult tweetPollResult = new UnitTweetPollResult();
        tweetPollResult.setResults(1L);
        tweetPollResult.setAnswersBean(new UnitAnswersBean());
        assertNotNull(tweetPollResult.getResults());
        assertNotNull(tweetPollResult.getAnswersBean());
    }

    /**
     * Unit Tweet Poll.
     */
    @Test
    public void testUnitTweetPoll(){
        final UnitTweetPoll tweetPoll = new UnitTweetPoll();
        tweetPoll.setId(1L);
        tweetPoll.setAllowLiveResults(true);
        tweetPoll.setCloseNotification(true);
        tweetPoll.setPublicationDateTweet(new Date());
        tweetPoll.setPublishPoll(true);
        tweetPoll.setUserId(1L);
        tweetPoll.setQuestionBean(new UnitQuestionBean());
        tweetPoll.setResultNotification(true);
        List<ResumeResultTweetPoll> results = new ArrayList<ResumeResultTweetPoll>();
        tweetPoll.setResults(results);
        tweetPoll.setSchedule(true);
        tweetPoll.setScheduleDate(new Date());
        tweetPoll.setTweetId(1L);
        tweetPoll.setCompleted(true);
        tweetPoll.setTweetUrl("http://www.encuestame.org");
        tweetPoll.setTwitterUserAccount("@encuestame");
        assertNotNull(tweetPoll.getCompleted());
        assertNotNull(tweetPoll.getTwitterUserAcoount());
        assertNotNull(tweetPoll.getTweetUrl());
        assertNotNull(tweetPoll.getTweetUrl());
        assertNotNull(tweetPoll.getScheduleDate());
        assertNotNull(tweetPoll.getId());
        assertNotNull(tweetPoll.getAllowLiveResults());
        assertNotNull(tweetPoll.getCloseNotification());
        assertNotNull(tweetPoll.getPublicationDateTweet());
        assertNotNull(tweetPoll.getPublishPoll());
        assertNotNull(tweetPoll.getTweetId());
        assertNotNull(tweetPoll.getQuestionBean());
        assertNotNull(tweetPoll.getResultNotification());
        assertNotNull(tweetPoll.getSchedule());
        assertNotNull(tweetPoll.getUserId());
        assertEquals(tweetPoll.getResults().size(), 0);
    }

    /**
     * Test {@link SignUpBean}.
     */
    @Test
    public void testSignUpBean(){
        final SignUpBean singUpBean = new SignUpBean();
        singUpBean.setEmail("juanATencuestame.org");
        singUpBean.setFullName("Juan");
        singUpBean.setPassword("12345");
        singUpBean.setUsername("jotadeveloper");
        assertNotNull(singUpBean.getEmail());
        assertNotNull(singUpBean.getFullName());
        assertNotNull(singUpBean.getPassword());
        assertNotNull(singUpBean.getUsername());
    }

    /**
     * Test {@link UnitGroupBean}.
     */
    @Test
    public void testUnitGroupBean(){
        final UnitGroupBean groupBean = new UnitGroupBean();
        groupBean.setId(1L);
        groupBean.setGroupDescription("group description");
        groupBean.setGroupName("group name");
        groupBean.setStateId("12345");
        assertNotNull(groupBean.getId());
        assertNotNull(groupBean.getStateId());
        assertNotNull(groupBean.getGroupDescription());
        assertNotNull(groupBean.getGroupName());
    }

    /**
     * Test {@link UnitPermission}.
     */
    @Test
    public void testUnitPermission(){
        final UnitPermission permission = new UnitPermission();
        permission.setId(1L);
        permission.setDescription("description");
        permission.setPermission("admin");
        assertNotNull(permission.getId());
        assertNotNull(permission.getDescription());
        assertNotNull(permission.getPermission());
    }

    /**
     * Test {@link UnitPoll}.
     */
    @Test
    public void testUnitPoll(){
        final UnitPoll poll = new UnitPoll();
        poll.setId(1L);
        poll.setCompletedPoll(true);
        poll.setCreationDate(new Date());
        poll.setQuestionBean(new UnitQuestionBean());
        assertNotNull(poll.getId());
        assertNotNull(poll.getQuestionBean());
        assertNotNull(poll.getCompletedPoll());
        assertNotNull(poll.getCreationDate());
    }

    /**
     * Test {@link UnitPollResult}.
     */
    @Test
    public void testUnitPollResult(){
        final UnitPollResult pollResult =  new UnitPollResult();
        pollResult.setAnswerBean(new UnitAnswersBean());
        pollResult.setPoll( new UnitPoll());
        pollResult.setResult(1L);
        pollResult.setVotedDate(new Date());
        assertNotNull(pollResult.getAnswerBean());
        assertNotNull(pollResult.getPoll());
        assertNotNull(pollResult.getResult());
        assertNotNull(pollResult.getVotedDate());
    }

    public void UnitProjectBean(){
        final UnitProjectBean projectBean = new UnitProjectBean();
        projectBean.setId(1L);
        projectBean.setDateFinish(new Date());
        projectBean.setDateInit(new Date());
        projectBean.setHide(true);
        projectBean.setLeader(1L);
        projectBean.setName("name");
        projectBean.setNotify(true);
        projectBean.setPriority("HIGH");
        projectBean.setState(1L);
        projectBean.setStatus(1L);
        projectBean.setUserId(1L);
        
    }
}
