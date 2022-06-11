import React from 'react';
import Video from '../../videos/video.mp4';
import { HeroContainer, HeroBg, VideoBg, HeroH1, HeroP, HeroBtnWrapper, ArrowForward, ArrowRight } from './HeroElements';

const HeroSection = () => {
    return (
        <HeroContainer>
            <HeroBg>
                <VideoBg autoPlay loop muted src={Video} type='video/mp4' />
            </HeroBg>
            <HeroContainer>
                <HeroH1>Virtual Banking Made Easy</HeroH1>
                <HeroP>
                    Sign up for a new account today and receive $250 in credit towards your next payment.
                </HeroP>
                <HeroBtnWrapper>
                    <Button to="signup">
                        Get started {hover ? <ArrowForward /> : <ArrowRight />}
                    </Button>
                </HeroBtnWrapper>
            </HeroContainer>
        </HeroContainer>
    );
};

export default HeroSection;