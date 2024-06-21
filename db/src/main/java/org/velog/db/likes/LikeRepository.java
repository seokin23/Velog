package org.velog.db.likes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.velog.db.user.UserEntity;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<LikeEntity, Long> {

}
