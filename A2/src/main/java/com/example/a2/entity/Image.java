package com.example.a2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_image")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Lob
    private byte[] data;

    private String type;
}

//@Entity
//@Table(name = "t_image")
//@Getter
//@Setter
//public class Image2 {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//
//    @Transient
//    private MultipartFile file;
//
//    private String path;
//
//    public void saveFile() throws IOException {
//        Path uploadPath = Paths.get("uploads/");
//        if (!Files.exists(uploadPath)) {
//            Files.createDirectories(uploadPath);
//        }
//        String filename = UUID.randomUUID().toString() + ".png";
//        Path filePath = uploadPath.resolve(filename);
//        Files.copy(file.getInputStream(), filePath);
//        this.path = filename;
//    }
//
//    public Resource getImageAsResource() throws FileNotFoundException, InterruptedException {
//        Path imagePath = Paths.get("uploads/").resolve(this.path);
//        Resource resource = new UrlResource(imagePath.toUri());
//        if (!resource.wait()) {
//            throw new FileNotFoundException("Image file not found: " + this.path);
//        }
//        return resource;
//    }
//}
