package com.nashss.se.partyplaylist.models;
import com.nashss.se.partyplaylist.dynamodb.models.Song;

import java.util.List;
import java.util.Objects;

public class UserModel {
    private final String userId;
    private final String firstName;
    private final String lastName;
    private final Boolean isHost;
    private final List<Song> songsAdded;
    private final List<Song> songsUpvoted;

    private UserModel(String userId, String firstName, String lastName,
                      Boolean isHost, List<Song> songsAdded, List<Song> songsUpvoted) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isHost = isHost;
        this.songsAdded = songsAdded;
        this.songsUpvoted = songsUpvoted;
    }

    public String getUserId() {

        return userId;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public Boolean isHost() {

        return isHost;
    }

    public List<Song> getSongsAdded() {

        return songsAdded;
    }

    public List<Song> getSongsUpvoted() {

        return songsUpvoted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserModel userModel = (UserModel) o;
        return Objects.equals(userId, userModel.userId) &&
                Objects.equals(firstName, userModel.firstName) &&
                Objects.equals(lastName, userModel.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstName, lastName);
    }

    //CHECKSTYLE:OFF:Builder
    public static Builder builder() {

        return new Builder();
    }

    public static class Builder {
        private String userId;
        private String firstName;
        private String lastName;
        private Boolean isHost;
        private List<Song> songsAdded;
        private List<Song> songsUpvoted;

        public Builder withUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withIsHost(Boolean isHost) {
            this.isHost = isHost;
            return this;
        }

        public Builder withSongsAdded(List<Song> songsAdded) {
            this.songsAdded = songsAdded;
            return this;
        }

        public Builder withSongsUpvoted(List<Song> songsUpvoted) {
            this.songsUpvoted = songsUpvoted;
            return this;
        }

        public UserModel build() {
            return new UserModel(userId, firstName, lastName, isHost, songsAdded, songsUpvoted);
        }
    }
}