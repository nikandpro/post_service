package faang.school.postservice.dto.feed;

import faang.school.postservice.dto.post.PostDto;

import java.util.List;

public record FeedDto(
        Long followerId,
        List<PostDto> posts
) {
}
