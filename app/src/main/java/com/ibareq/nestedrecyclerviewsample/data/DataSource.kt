package com.ibareq.nestedrecyclerviewsample.data

import com.ibareq.nestedrecyclerviewsample.data.domain.Post
import com.ibareq.nestedrecyclerviewsample.data.domain.Story

object DataSource {
    //fake data for learning only
    fun getStories(): List<Story> = listOf(
        Story(false, "https://www.archiefoundationhome.org.uk/wp-content/uploads/2020/05/profile-photo-social-media.jpg"),
        Story(true, "https://pbs.twimg.com/profile_images/1346200826998644736/GXKFXDl7_400x400.jpg"),
        Story(false, "https://fiverr-res.cloudinary.com/t_profile_original,q_auto,f_auto/attachments/profile/photo/1f846f639010a1e7e1883aaab85b58f0-1533776088426/Screenshot%202018-08-08%20at%208.12.47%20PM%20-%20Edited.png"),
        Story(false, "https://transportationenergypartners.org/wp-content/uploads/2020/08/random-person-3.jpg"),
        Story(false, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTiMsC4W_flKXR6Nkvfv7cIZWm5eAqQE0BqNisDXlT3RuxGMKw3yw8We2IPAHq0ymgZ-nE&usqp=CAU"),
        Story(false, "https://www.chaac.tf.fau.eu/files/2021/02/1071625.jpg"),
        Story(false, "https://img.wattpad.com/ac774401878614400d9ff2eba27870e8cca3ba8f/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6a7445346c65564975635a4834773d3d2d3434393237343839362e313464363865343537326634373334323733303639343033363234382e6a7067"),
        Story(false, "https://i.pinimg.com/736x/78/83/76/7883768da271cfb0043feca9314a3120.jpg"),
        Story(false, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQD3lQV4529eaHbwr59_bfOSYRXhvpfrQEusA&usqp=CAU"),
        Story(true, "https://i.pinimg.com/originals/9f/aa/a1/9faaa1fedc94c355a4256ba6207c7714.png"),
        Story(true, "https://vengreso.com/wp-content/uploads/2016/03/LinkedIn-Profile-Professional-Picture-Sample-Bernie-Borges.png"),
        Story(true, "https://i.pinimg.com/originals/5a/23/d7/5a23d7a5b80c846695b7c92b2876f09e.jpg"),
    )

    fun getPosts(): List<Post> = listOf(
        Post(username = "Ali Jaleel", date = "2021/6/5", profileImgUrl = "https://www.archiefoundationhome.org.uk/wp-content/uploads/2020/05/profile-photo-social-media.jpg", postImgUrl = "https://img.freepik.com/free-vector/colorful-palm-silhouettes-background_23-2148541792.jpg?size=626&ext=jpg&ga=GA1.2.1685543998.1622592000"),
        Post(username = "Amnah Ali", date = "2021/6/5", profileImgUrl = "https://fiverr-res.cloudinary.com/t_profile_original,q_auto,f_auto/attachments/profile/photo/1f846f639010a1e7e1883aaab85b58f0-1533776088426/Screenshot%202018-08-08%20at%208.12.47%20PM%20-%20Edited.png", postImgUrl = "https://arabicpost.net/wp-content/uploads/2020/08/27299.jpeg"),
        Post(username = "Sajjad Abdul-Aziz", date = "2021/6/4", profileImgUrl = "https://transportationenergypartners.org/wp-content/uploads/2020/08/random-person-3.jpg", postImgUrl = "https://cnn-arabic-images.cnn.io/cloudinary/image/upload/w_780,c_scale,q_auto/cnnarabic/2019/01/12/images/119388.jpg"),
        Post(username = "Sahar Qais", date = "2021/6/4", profileImgUrl = "https://www.chaac.tf.fau.eu/files/2021/02/1071625.jpg", postImgUrl = "https://cdn.al-ain.com/images/2020/4/19/62-165230-new-technique-understand-reaction-plants_700x400.jpg"),
        Post(username = "Mohammed Hakeem", date = "2021/6/4", profileImgUrl = "https://pbs.twimg.com/profile_images/1346200826998644736/GXKFXDl7_400x400.jpg", postImgUrl = "https://media.alalamtv.net/uploads/855x495/2019/12/31/157780944060749600.jpg"),
        Post(username = "Shahad Abdul-Hasan", date = "2021/6/4", profileImgUrl = "https://img.wattpad.com/ac774401878614400d9ff2eba27870e8cca3ba8f/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6a7445346c65564975635a4834773d3d2d3434393237343839362e313464363865343537326634373334323733303639343033363234382e6a7067", postImgUrl = "https://ichef.bbci.co.uk/news/640/cpsprodpb/115CF/production/_115591117_gettyimages-1284429766.jpg"),
        Post(username = "Ali Jaleel", date = "2021/6/2", profileImgUrl = "https://www.archiefoundationhome.org.uk/wp-content/uploads/2020/05/profile-photo-social-media.jpg", postImgUrl = "https://yalalla.com/wp-content/uploads/sites/2/2016/06/ultimate-veggie-burger-840x560.jpg"),
        Post(username = "Shahad Kadhim", date = "2021/5/31", profileImgUrl = "https://i.pinimg.com/originals/5a/23/d7/5a23d7a5b80c846695b7c92b2876f09e.jpg", postImgUrl = "https://cdni.rt.com/media/pics/2019.05/original/5cf0384895a597263f8b45f5.JPG"),
        Post(username = "Ahmed Abdul-Kareem", date = "2021/5/30", profileImgUrl = "https://vengreso.com/wp-content/uploads/2016/03/LinkedIn-Profile-Professional-Picture-Sample-Bernie-Borges.png", postImgUrl = "https://socialmediaforhousing.files.wordpress.com/2011/05/coins_64133569.jpg"),
        Post(username = "Rahama Ahmed", date = "2021/5/30", profileImgUrl = "https://i.pinimg.com/736x/78/83/76/7883768da271cfb0043feca9314a3120.jpg", postImgUrl = "https://read.opensooq.com/wp-content/uploads/2021/01/%D8%AC%D8%AF%D9%88%D9%84-%D8%AD%D9%81%D8%B8-%D8%A7%D9%84%D9%82%D8%B1%D8%A2%D9%86-%D8%A7%D9%84%D9%83%D8%B1%D9%8A%D9%85-%D9%83%D8%A7%D9%85%D9%84%D8%A7%D9%8B.webp"),
        Post(username = "Shahad Abdul-Hasan", date = "2021/5/29", profileImgUrl = "https://img.wattpad.com/ac774401878614400d9ff2eba27870e8cca3ba8f/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6a7445346c65564975635a4834773d3d2d3434393237343839362e313464363865343537326634373334323733303639343033363234382e6a7067", postImgUrl = "https://online.stanford.edu/sites/default/files/styles/wide/public/2020-06/What-makes-a-leader-great-during-a-crisis.jpg?itok=lJDFFUT3"),
        Post(username = "Amnah Ali", date = "2021/5/24", profileImgUrl = "https://fiverr-res.cloudinary.com/t_profile_original,q_auto,f_auto/attachments/profile/photo/1f846f639010a1e7e1883aaab85b58f0-1533776088426/Screenshot%202018-08-08%20at%208.12.47%20PM%20-%20Edited.png", postImgUrl = "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F23%2F2010%2F10%2F27%2Fginger-chicken-soup_0.jpg"),
        Post(username = "Aya Alnaqeep", date = "2021/5/22", profileImgUrl = "https://i.pinimg.com/originals/9f/aa/a1/9faaa1fedc94c355a4256ba6207c7714.png", postImgUrl = "https://editorial.fxstreet.com/images/Markets/Currencies/Majors/DollarIndex/rows-of-dollars-bundles-background-19722556_16x9.jpg"),
        Post(username = "Noor Ahmed", date = "2021/5/22", profileImgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQD3lQV4529eaHbwr59_bfOSYRXhvpfrQEusA&usqp=CAU", postImgUrl = "https://addons-media.operacdn.com/media/CACHE/images/themes/95/78195/1.0-rev1/images/f1b54fe9-e138-44e6-929b-182bb1e82a68/e692a2c2fe07202eda545c69833230bd.jpg"),
    )
}