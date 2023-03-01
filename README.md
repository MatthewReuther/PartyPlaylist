<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a name="readme-top"></a>


[![Contributors][contributors-shield]][contributors-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/MatthewReuther/PartyPlaylist">
    <img src="resources/images/logo.png" alt="Logo" width="80" height="80">
  </a>

<h3 align="center">Party Playlist</h3>

  <p align="center">
    Collaborate with Friends to Build the Perfect Playlist, and Vote on Your Favorite Tracks to Keep the Party Going All Night Long!
    <br />
    <a href="https://github.com/MatthewReuther/PartyPlaylist"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="#usage">View Demo</a>
  </p>
</div>


<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>


<!-- ABOUT THE PROJECT -->
## About The Project
Party Playlist was created by a group of Nashville Software School students as their midstone project. The app was designed to solve the age-old problem of "Who has the aux cord?" at parties and events. With Party Playlist, users can create a custom playlist for their party, invite their friends to add songs from a database, and upvote their favorite tracks to ensure they get played first.

The development team consisted of four members, including myself, Matt Leigh, Travers Geoffray, and Jake Price. Each team member was responsible for creating their assigned API, from backend to frontend. For example, while I worked on `CreatePlaylist` API another team member was tasked with and worked on creating the `AddGuestToParty` API. 

In addition, the team was divided into two groups: Jake Price and I worked on adding more design features to the frontend, while Matt Leigh and Travers created the songs table and table designs.

Overall, Party Playlist was a collaborative effort that allowed us to apply the skills we learned so far in our program to a real-world project. We are proud of what we accomplished and grateful for the opportunity to work together as a team. We hope that Party Playlist will be a useful tool for party planners and their guests for years to come.

## Things I Learned

Having worked as a frontend developer for a while, I was able to contribute significantly to the structure and overall look and feel of the Party Playlist application. However, although I had some experience with backend design, I had never created my own backend design from scratch before.

Up until this part of the course, we went deep into backend design, and there was a lot to absorb. It was sometimes a challenge to connect all the dots and fully comprehend how everything came together. However, this learning experience gave me a valuable understanding of how the frontend and backend are connected, and I gained a deeper appreciation of how the AWS services worked together.

In addition to technical skills, I also gained an appreciation for effective teamwork. Collaborating with a team of developers allowed us to break down tasks and concentrate on areas where we had the most expertise. Everyone was fantastic to work with, and we all worked together to ensure the project's success.

Overall, the experience helped me develop a more well-rounded set of skills and gave me greater confidence in my ability to contribute to a team's success in creating complex applications like Party Playlist.

<p align="right">(<a href="#readme-top">back to top</a>)</p>


### Built With

| Back-end                                                        | Front-end                                    |
|-----------------------------------------------------------------|----------------------------------------------|
| [![Java][Java]][Java-url]                                       | [![JavaScript][JavaScript]][JavaScript-url]  | 
| [![Lambda][Lambda]][Lambda-url]                                 | [![Bootstrap][Bootstrap.com]][Bootstrap-url] | 
| [![AWS CloudFront][AWS CloudFront]][CloudFront-url]             |                                              |
| [![DynamoDB][DynamoDB]][DynamoDB-url]                           |                                              |
| [![API Gateway][API Gateway]][Gateway-url]                      |                                              |
| [![AWS CloudFormation][AWS CloudFormation]][CloudFormation-url] |                                              |


<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites and Installation

1. Create or use an existing Amazon AWS account.
2. Install the latest version of AWS CLI. [Link to documentation](https://docs.aws.amazon.com/cli/latest/userguide/getting-started-install.html)
3. Install the latest version of AWS SAM CLI. [Link to documentation](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/install-sam-cli.html)
4. Install NodeJS before you can run some of the commands below (the `npm` ones).

- On Windows / WSL:
```shell
curl -fsSL https://deb.nodesource.com/setup_18.x | sudo -E bash - &&\
sudo apt-get install -y nodejs
```
- On macOS:
```shell
brew install node
```

### Run Locally

3. Run the Lambda service (aka the backend):
    - Build the Java code: `sam build`
    - Create an S3 bucket: `aws s3 mb s3://YOUR_BUCKET`
    - Deploy the SAM template: `sam deploy --s3-bucket BUCKET_FROM_ABOVE --parameter-overrides S3Bucket=BUCKET_FROM_ABOVE FrontendDeployment=local`
      > **NOTE:** _Yes you have to provide the same S3 bucket name twice. Yes this is annoying._
    - Run the local API: `sam local start-api --warm-containers LAZY`
4. Run a local web server (aka the frontend):
    - CD into the web directory: `cd web`
    - Install dependencies : `npm install`
    - Run the local server: `npm run run-local`
    -  > **NOTE:** Only songs found in the song table can be added to the playlist.

After doing all of this, you will have a server running on port `8000` - you can access it by going to [http://localhost:8000](http://localhost:8000) in your browser.

To stop either the local backend (the `sam local...` command) or local frontend (the `npm run...`) command, simply press `Ctrl-C` in the terminal where the process is running.

### Songs Table

| Song Title              | Song Artist       |
|-------------------------|-------------------|
| Just Like Heaven        | The Cure          | 
| The Yellow Submarine    | The Beatles       | 
| I'm On A Boat           | The Lonely Island |
| Come Sail Away          | Styx              |
| Sailing                 | Christopher Cross |
| Allstar                 | Smash Mouth       |
| Never Gonna Give You Up | Rick Astley       |
| Danger Zone             | Kenny Loggins     |


<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- USAGE EXAMPLES -->
## Usage

[Party Playlist Demo](https://user-images.githubusercontent.com/57022409/209223943-2804c2cd-f6af-41b7-abe0-5774fd682b4a.mp4)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

Matthew Reuther - matthew.reuther@gmail.com

Project Link: [https://github.com/MatthewReuther/PartyPlaylist](https://github.com/MatthewReuther/PartyPlaylist)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/MatthewReuther/PartyPlaylist.svg?style=for-the-badge
[contributors-url]: https://github.com/MatthewReuther/PartyPlaylist/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo_name.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo_name/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo_name.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo_name/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo_name.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo_name/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo_name.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo_name/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/matthewreuther/
[DynamoDb]: https://img.shields.io/badge/AWS_DynamoDB-yellow?style=for-the-badge&logo=amazondynamodb&logoColor=4053D6
[DynamoDb-url]: https://aws.amazon.com/dynamodb/
[Lambda]: https://img.shields.io/badge/AWS_Lambda-blue?style=for-the-badge&logo=awslambda&logoColor=FF9900
[Lambda-url]: https://aws.amazon.com/lambda/
[API Gateway]: https://img.shields.io/badge/AWS_API_Gateway-black?style=for-the-badge&logo=amazonapigateway&logoColor=FF4F8B
[Gateway-url]: https://aws.amazon.com/api-gateway/
[JavaScript]: https://img.shields.io/badge/JavaScript-20232A?style=for-the-badge&logo=javascript&logoColor=61DAFB
[JavaScript-url]: https://javascript.com/
[Bootstrap.com]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[Bootstrap-url]: https://getbootstrap.com
[Java]: https://img.shields.io/badge/Java-darkgreen?style=for-the-badge
[Java-url]: https://java.com/
[AWS CloudFront]: https://img.shields.io/badge/AWS_CloudFront-orange?style=for-the-badge
[Cloudfront-url]: https://aws.amazon.com/cloudfront/
[AWS CloudFormation]: https://img.shields.io/badge/AWS_CloudFormation-red?style=for-the-badge
[Cloudformation-url]: https://aws.amazon.com/cloudformation/