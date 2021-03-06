package hollow.phantom.repository;

import hollow.phantom.domain.User;
import hollow.phantom.domain.UserSubscription;
import hollow.phantom.domain.UserSubscriptionId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserSubscriptionRepository extends JpaRepository<UserSubscription, UserSubscriptionId> {
    List<UserSubscription> findBySubscriber(User user);

    List<UserSubscription> findByChannel(User channel);

    UserSubscription findByChannelAndSubscriber(User channel, User subscriber);
}