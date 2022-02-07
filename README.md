
# MediGO
An On the Go healthcare application that brings right care right time.


The problem MediGO solves
The main motivation behind this project is that, our blood contains humongous data, that we ourselves aren’t aware of.
Medical tests and procedures are usually costly and deprived to the needy population of our country.
The patient in most cases isn’t aware of what tests are being performed on him/her and these test MIGHT also include medical negligence and inaccuracies.
And finally most people aren’t aware on what exactly to do during emergencies.
Medical camps are misguiding the patients.
And many people aren't aware of what to do when an emergency occurs.

Free medical care, right at home.
A Friendly, Virtual doctor.
To facilitate the ease of locating nearby hospitals.
Suggestions from the App to the user for maintaining a better hygeine and fitness.
Informing the ambulance service and getting immediate assistance from medical experts during emergencies.

The various functionalities are:
Analyze Blood Test reports and predict possible Diseases.
Intelligent Notification system based on the disease predicted.
An intelligent Medical Virtual Assistant.
Immediate medical assistance & ambulance service for common people and maximum utilization of “golden hour”
Immediate gesture driven medical attention/alert to an aide of a person especially useful for the elderly.

Challenges we ran into:
This app centric approach although cost is a major factor, with smart phones expanding horizons it does not hinder the features such as Disease Predictor and SOS alert even in remote locations.
The datasets have to be authentic and approved in case of both Disease Predictor and our Virtual Assistant.
Also, the lack of authentic dataset for Disease Predictor.
We might encounter with corner cases such as Side effects in the case of the medicines suggested by our Virtual Assistant.

Mentioning about a BUG specifically was our Virtual Assistant which didnt give the desired results initially.
To overcome that we had to lemmatize our bad of words and also had to add a lot of non-conflicting bag of words in our JSON file.

Technologies we used
Firebase TensorFlow Android Studio XML Python Neural Network
