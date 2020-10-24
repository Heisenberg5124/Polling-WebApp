package com.anon.pollingappserver.services;

import com.anon.pollingappserver.models.Poll;
import com.anon.pollingappserver.payloads.PagedResponse;
import com.anon.pollingappserver.payloads.PollRequest;
import com.anon.pollingappserver.payloads.PollResponse;
import com.anon.pollingappserver.payloads.VoteRequest;
import com.anon.pollingappserver.security.UserPrincipal;

public interface PollService {
    PagedResponse<PollResponse> getAllPolls(UserPrincipal currentUser, int page, int size);

    PagedResponse<PollResponse> getPollsCreatedBy(String username, UserPrincipal currentUser, int page, int size);

    PagedResponse<PollResponse> getPollsVotedBy(String username, UserPrincipal currentUser, int page, int size);

    Poll createPoll(PollRequest pollRequest);

    PollResponse getPollById(Long pollId, UserPrincipal currentUser);

    PollResponse castVoteAndGetUpdatedPoll(Long pollId, VoteRequest voteRequest, UserPrincipal currentUser);
}
